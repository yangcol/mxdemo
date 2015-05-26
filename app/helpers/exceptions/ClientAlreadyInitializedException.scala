/**
 * Created by yangqing on 3/11/15.
 *
 */
package helpers.exceptions

/** ClientAlreadyInitializedException
 * @constructor create an exception
 * @param msg message
 */
case class ClientAlreadyInitializedException(msg:String) extends Exception