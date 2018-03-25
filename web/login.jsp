<%-- 
    Document   : login
    Created on : Mar 23, 2018, 11:40:47 PM
    Author     : LoirArboni
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="loginCabecalho.jsp"/>
<body >
    <div id="esqueci">
        <div>
            <a href="registro.jsp">Registrar</a>
        </div>
        <div class="col s8 right-align">
            <a href="#" class="">Esqueci a senha</a>
        </div>
    </div>

    <div class="loginForm">
        <div class="row">
            <div class="col s12 m8 offset-m2">
                <form class="loginForm">
                    <div >
                        <div>
                            <img id="loginImage" src="images/ze_gotinha.jpg">

                            <h2>Login</h2>

                            </span>
                        </div>
                        <div >
                            <div class="input-field">
                                <input autofocus="true" placeholder="Informe o email" class="validate" autocomplete="on" required="true" id="email" type="email">
                                <label for="email">Email</label>
                            </div>

                            <div class="row">
                                <div class="col s12 m8 l9">
                                    <div class="input-field">
                                        <input placeholder="Informe a senha" autocomplete="on" required="true" id="password" type="password">
                                        <label for="password">Senha</label>
                                    </div>
                                </div>
                                <div class="col s12 m4 l3">

                                    <div class="input-field">
                                        <input type="checkbox" id="remember-me" />
                                        <label for="remember-me">Lembrar</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card-action blue-grey lighten-3">
                           
                            <div class="center-align">
                                <a href="login.html" class="btn blue-grey darken-1"><i class="material-icons left">Entrar</i></a>
                            </div>
                            
                        </div>
                         <div class="center-align">
                                <input type="reset" value="limpar campos" class="btn blue-grey darken-1"></input>
                            </div>
                    </div>
                </form>

            </div>
        </div>

    </div>


    <c:import url="loginRodape.jsp"/>