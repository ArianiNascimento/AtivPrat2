import NavBar from '../NavBar';
import Footer from '../Footer';

function Index() {
    return (
        <body>
            <NavBar/>      
            <h1>Seja bem-vindo(a)!</h1>
            <h2>Compre passagens para todo o Brasil, promoções de até 50% de desconto, aproveite!</h2>
            <div class="formulario">
                <h4>Realize seu cadastro</h4>
                <form>
                    <label for="name">Nome Completo: </label>
                    <input type="text"/>
                    <br/>
                    <br/>
                    <label for="num">CPF (apenas números): </label>
                    <input type="text"/>
                    <br/>
                    <br/>
                    <label for="email">E-mail: </label>
                    <input type="email"/>
                    <br/>
                    <br/>
                    <label for="senha">Senha: </label>
                    <input type="password"/>
                    <br/>
                    <br/>
                    <button><b>Cadastrar</b></button>
                    <br/>
                    <br/>
                </form>
            </div>
            <Footer/>
        </body>
    );
}

export default Index;