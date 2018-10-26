package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import domain.ProductVO;
import persistence.ProductDAO;

public class SelectAllAction implements Action {
	private String path;
	

	public SelectAllAction(String path) {
		super();
		this.path = path;
	}


	@Override
	public ActionForward execute(HttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		ProductDAO dao= new ProductDAO();
		ArrayList<ProductVO> list = dao.selectAll();
		if(!list.isEmpty()) {
			req.setAttribute("list", list);
		}
		return new ActionForward(path, false);
	}

}
