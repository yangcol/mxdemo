import helpers.logger.{RecLogging, ApplicationLogger}
import play.api._
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent.Future

object Global extends GlobalSettings with RecLogging{
  val logger = ApplicationLogger
  override def onStart(app: Application) {
    logger.info("Application has started")
  }

  override def onStop(app: Application) {
    logger.info("Application shutdown...")
  }

  override def onError(request: RequestHeader, ex: Throwable) = {
    Future.successful(InternalServerError(
      views.html.errorPage("出错了")
    ))
  }

  override def onHandlerNotFound(request: RequestHeader) = {
    Future.successful(NotFound(
      views.html.notFoundPage(request.path)
    ))
  }

  override def onBadRequest(request: RequestHeader, error: String) = {
    Future.successful(BadRequest("Bad Request: " + error))
  }
}