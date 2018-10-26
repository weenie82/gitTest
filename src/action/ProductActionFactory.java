package action;


public class ProductActionFactory {
	private ProductActionFactory() {}
	
	private static ProductActionFactory paf;
	
	public static ProductActionFactory getInstance() {
		if(paf==null) 
			paf=new ProductActionFactory();
		return paf;	
	}
	Action action=null;
	public Action action (String cmd) 
	{
		if(cmd.equals("/insert.do")) {
			action=new InsertAction("selectAll.do");
		}else if(cmd.equals("/selectAll.do")) {
			action= new SelectAllAction("views/selectAll.jsp");
		}else if(cmd.equals("/select.do")) {//하나만 가져오기
			action=new SelectOneAction("views/selectOne.jsp");
		}else if(cmd.equals("/delete.do")) {
			action=new DeleteAction("selectAll.do");
		}else if(cmd.equals("/modify.do"))
			action= new ModifyAction("selectAll.do");
				
		return action;
	}
}
