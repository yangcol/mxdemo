package controllers

import play.api.mvc.{Action, Controller}
/**
 * Created by yangqing on 5/24/15.
 */
object Video extends Controller{
  def index= Action {
    Ok("show all index for videos")
  }

  def get(id:String)= Action {
    Redirect("http://www.baidu.com")
//    Ok.sendFile(new java.io.File("/Users/yangqing/reversedc.txt"), fileName = (name) => "reversedc.txt")

    //    val name = "123.txt"
//    Ok(new File("/Users/yangqing/reversedc.txt")).withHeaders(
//    CONTENT_TYPE -> "application/x-download",
//      CONTENT_DISPOSITION -> s"attachment; filename=$name"
//    )
//    response().setContentType("application/x-download");
//    response().setHeader("Content-disposition","attachment; filename=tradeLogTest.xlsx");
//    return ok(new File("/absolute/path/to/tradeLogTest.xlsx"));
  }
}
