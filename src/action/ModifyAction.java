package action;

import javax.servlet.http.HttpServletRequest;

import persistence.ProductDAO;

public class ModifyAction implements Action {
	private String path;
	

	public ModifyAction(String path) {
		super();
		this.path = path;
	}


	@Override
	public ActionForward execute(HttpServletRequest req) throws Exception {
		
		int prcode =Integer.parseInt(req.getParameter("prcode"));
		int price =Integer.parseInt(req.getParameter("price"));
		
		//수정
		ProductDAO dao = new ProductDAO();
		int result = dao.product_update(prcode, price);
		
		if(result == 0) {
			path="error/error.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
