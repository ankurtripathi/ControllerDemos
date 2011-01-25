<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Simple GSP page</title></head>
  <body>Default Hello Action ${params.someString}  from Sample Controller's Hello view
  <br>
  Hello ${session.username}
  ${flash.message}

  </body>
</html>