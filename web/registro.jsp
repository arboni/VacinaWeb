<%-- 
    Document   : registro
    Created on : Mar 24, 2018, 09:57:32 PM
    Author     : LoirArboni
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="loginCabecalho.jsp"/>

<div id="registro">

    <form action="#" method="post">
        <fieldset>
            <fieldset class="row">
                <div class="row">

                    <label for="nome">CPF</label>
                    <input type="text" id="cpf" name="cpf" style="width: 10em" value="">
                    <label for="nome">Nome</label>
                    <input type="text" id="nome" name="nome" style="width: 10em" value="">
                    <label for="snome">Sobrenome</label>
                    <input type="text" id="snome" name="snome" style="width: 10em" value="">
                </div>

               

            </fieldset>
            <div class="campo">
                <label>Sexo</label>
                <label>
                    <input type="radio" name="sexo" value="masculino"> Masculino
                </label>
                <label>
                    <input type="radio" name="sexo" value="feminino"> Feminino
                </label>
            </div>
            <div class="campo">
                <label for="email">E-mail</label>
                <input type="text" id="email" name="email" style="width: 20em" value="">
            </div>
            <div class="campo">
                <label for="telefone">Telefone</label>
                <input type="text" id="telefone" name="telefone" style="width: 10em" value="">
            </div>

            <fieldset class="grupo">
                <div class="campo">
                    <label for="cidade">Cidade</label>
                    <input type="text" id="cidade" name="cidade" style="width: 10em" value="">
                </div>
                <div class="campo">
                    <label for="estado">Estado</label>
                    <select name="estado" id="estado">
                        <option value=""></option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                        <option value="ES">Estrangeiro</option>
                    </select>
                </div>
            </fieldset>

            <div class="campo">
                <label for="mensagem">Mensagem</label>
                <textarea rows="6" style="width: 20em" id="mensagem" name="mensagem"></textarea>
            </div>

            <div class="campo">
                <label>Newsletter</label>
                <label>
                    <input  required="true"type="checkbox" name="newsletter" value="1"> Sou responsável pelas informações prestadas  neste formulário.
                </label>
                 <button type="submit" name="submit">Enviar</button>
            </div>
           
        </fieldset>
    </form>

</div>  



<c:import url="loginRodape.jsp"/>