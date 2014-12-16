/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */
package akka.stream

import scala.util.control.NoStackTrace
import java.net.InetSocketAddress

class StreamTcpException(msg: String) extends RuntimeException(msg) with NoStackTrace

case object BindFailedException extends BindFailedException

class BindFailedException extends StreamTcpException("bind failed")

class ConnectionException(msg: String) extends StreamTcpException(msg)

class ConnectionAttemptFailedException(val endpoint: InetSocketAddress) extends ConnectionException(s"Connection attempt to $endpoint failed")
