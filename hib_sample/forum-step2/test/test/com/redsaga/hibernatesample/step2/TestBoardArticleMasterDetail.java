package test.com.redsaga.hibernatesample.step2;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.LockMode;
import net.sf.hibernate.Session;

import com.redsaga.hibnatesample.step2.Article;
import com.redsaga.hibnatesample.step2.Board;
import com.redsaga.hibnatesample.step2.ForumService;
import com.redsaga.hibnatesample.step2.ForumServiceFactory;
import com.redsaga.hibnatesample.step2.User;
import com.redsaga.hibnatesample.step2.base._BaseRootDAO;
import com.redsaga.hibnatesample.step2.dao.RootDAO;
import com.redsaga.hibnatesample.step2.dao.UserDAO;
import com.redsaga.hibnatesample.step2.dao._RootDAO;

import junit.framework.TestCase;

/**
 * @author cao
 */
public class TestBoardArticleMasterDetail extends TestCase {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestUserCRUD.class);
	}

	public void setUp() throws HibernateException
	{
		_BaseRootDAO.initialize();
	}

	public void testBoardArticleMasterDetail() throws HibernateException
	{
		ForumService fs = ForumServiceFactory.getHibernateForumService();
		
		//�����û�
		User shark = new User();
		shark.setName("Shark");
		shark.setPwd("guessme");
		fs.saveUser(shark);
		
		//��������
		Board a = new Board();
		a.setCreateBy(shark);
		a.setName("A");
		fs.addBoard(a);
		
		//��������
		Article article1 = new Article();
		article1.setTitle("article1");
		article1.setLastUpdateTime(new Date());
		article1.setLastUpdateBy(shark);
		article1.setCreateBy(shark);

		Article article2 = new Article();
		article2.setTitle("article2");
		article2.setCreateBy(shark);
		article2.setLastUpdateBy(shark);
		article2.setLastUpdateTime(new Date());
		
		//�����Ӽ��뵽����
		fs.addNewPost(a,article1);
		fs.addNewPost(a,article2);
		
		Board a2 = fs.getBoard(a.getId());
		a2.getArticles();
		Session session = RootDAO.createSession();
		assertEquals("[article1][article2]",printArticleInBoard(a2));
		RootDAO.getInstance().closeSession();
		
		//ɾ������
		fs.deleteBoard(a2);

		//ȷ����ص�����Ҳ������ɾ����
		session = RootDAO.createSession();
		List shouldBeEmpty = session.find("from Article where title='article1'");
		assertEquals(0,shouldBeEmpty.size());
		RootDAO.getInstance().closeSession();
		
		fs.deleteUser(shark);
	}

	protected String printArticleInBoard(Board board) throws HibernateException
	{
		Session session = RootDAO.createSession();
		session.lock(board,LockMode.READ);
		
		Iterator it = board.getArticles().iterator();
		String articles = "";
		while (it.hasNext())
		{
			Article article = (Article) it.next();
			session.lock(article,LockMode.READ);
			articles += "["+article.getTitle()+"]";
		}
		return articles;
	}
	
}
