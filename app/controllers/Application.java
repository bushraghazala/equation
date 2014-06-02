package controllers;




import play.*;
import play.mvc.*;
import play.data.* ;
import models.*;
import views.html.*;




public class Application extends Controller {
  
 
static Form<Equation> eForm = Form.form(Equation.class);   
 
public static Result index()
{

 
    return ok (views.html.clac.render(eForm));
   
}

public static Result calculate()
{ 

Form<Equation> filledForm = eForm.bindFromRequest();
  if(filledForm.hasErrors()) {
    return ok("errrooror"); 
  }
 else
 {
Equation e=filledForm.get();
e.calculate(filledForm.get());
  //filledForm.get()));   
 return ok(views.html.index.render(eForm,filledForm.get()));    
} 
}
}