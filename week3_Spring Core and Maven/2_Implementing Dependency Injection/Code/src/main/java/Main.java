import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class Main {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		BookService bkSrvc = (BookService) ctx.getBean("bookService");
		bkSrvc.listBooks();
		
		}
	}
}
