<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"  %>
<head>
    <title>登入頁</title>
    <jsp:include page="../common/includes.jsp"></jsp:include>
    <style>
        .bd-placeholder-img {
          font-size: 1.125rem;
          text-anchor: middle;
          -webkit-user-select: none;
          -moz-user-select: none;
          user-select: none;
        }
  
        @media (min-width: 768px) {
          .bd-placeholder-img-lg {
            font-size: 3.5rem;
          }
        }
  
        .b-example-divider {
          height: 3rem;
          background-color: rgba(0, 0, 0, .1);
          border: solid rgba(0, 0, 0, .15);
          border-width: 1px 0;
          box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
        }
  
        .b-example-vr {
          flex-shrink: 0;
          width: 1.5rem;
          height: 100vh;
        }
  
        .bi {
          vertical-align: -.125em;
          fill: currentColor;
        }
  
        .nav-scroller {
          position: relative;
          z-index: 2;
          height: 2.75rem;
          overflow-y: hidden;
        }
  
        .nav-scroller .nav {
          display: flex;
          flex-wrap: nowrap;
          padding-bottom: 1rem;
          margin-top: -1px;
          overflow-x: auto;
          text-align: center;
          white-space: nowrap;
          -webkit-overflow-scrolling: touch;
        }
      </style>
      <link href="../../../script/css/signin.css" rel="stylesheet">
</head>

<body class="text-center">

    <main class="form-signin w-100 m-auto">
      <form>    
        <div class="form-floating">
          <input type="email" class="form-control" id="email" placeholder="name@example.com">
          <label for="floatingInput">Email address</label>
        </div>
        <div class="form-floating">
          <input type="password" class="form-control" id="password" placeholder="Password">
          <label for="floatingPassword">Password</label>
        </div>
    
        <div class="checkbox mb-3">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="w-100 btn btn-lg btn-primary" type="button" onclick="send()">Sign in</button>
        <p class="mt-5 mb-3 text-muted">&copy; 2017–2022</p>
      </form>
    </main> 
            
    </body>
    <script>
      function send(){
          $.ajax({
          url:"<%= request.getContextPath()%>/login/login",
          type:"POST",
          dataType:"json",
          contentType: "application/json",
          data:JSON.stringify({
            password:$("#password").val(),
            email:$("#email").val()
          }),
          success:function(data){
            console.log(`success! data =` + JSON.stringify(data));
          },error:function(error){
            console.log(`error!  error = ${error}`)
          }
        })
      }     
    </script>
  </html>
    
  
  


