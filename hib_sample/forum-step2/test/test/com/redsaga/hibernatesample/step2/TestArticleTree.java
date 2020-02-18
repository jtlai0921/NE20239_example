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
public class TestArticleTree extends TestCase {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestUserCRUD.class);
	}

	public void setUp() throws HibernateException
	{
		_BaseRootDAO.initialize();
	}
	
	public void testArticleTree() throws HibernateException
	{
		ForumService fs = ForumServiceFactory.getHibernateForumService();
		
		//׼���û�
		User shark = new User();
		shark.setName("Shark");
		shark.setPwd("guessme");
		fs.saveUser(shark);
		
		//׼������
		Board board = new Board();
		board.setCreateBy(shark);
		board.setName("A");
		fs.addBoard(board);
		
		//��������
		Article root = new Article();
		root.setTitle("test");
		root.setLastUpdateTime(new Date());
		root.setLastUpdateBy(shark);
		root.setCreateBy(shark);
		fs.addNewPost(board,root);
		
		//����3����һ��������ÿ����������3���ڶ�������
		for (int i=0;i<3;i++)
		{
			Article child = new Article();
			child.setTitle("test");
			child.setLastUpdateTime(new Date());
			child.setLastUpdateBy(shark);
			child.setCreateBy(shark);
			fs.replyPost(root,child);
			for (int j=0;j<3;j++)
			{
				Article child2 = new Article();
				child2.setTitle("test");
				child2.setLastUpdateTime(new Date());
				child2.setLastUpdateBy(shark);
				child2.setCreateBy(shark);
				fs.replyPost(child,child2);
			}
		}
		
		/* ��3ҳֻ���������� */
		List pagedList = fs.getBoardPostList(board,4,3);
		assertEquals(2,pagedList.size());
		
		/* �м�һҳ��4������ */
		pagedList = fs.getBoardPostList(board,4,2);
		assertEquals(4,pagedList.size());
		
		String pagedTree = "";
		for (int i=0;i<pagedList.size();i++)
		{
			Article a = (Article)pagedList.get(i);
			pagedTree += "["+a.getTreeIndex()+"]";
		}
		
		fs.deleteBoard(board);
		fs.deleteUser(shark);

		assertEquals(
				"[0001.0001.0003]"+
				"[0001.0002]"+
				"[0001.0002.0001]"+
				"[0001.0002.0002]",pagedTree);
		
	}
	
}
