import Footer from "../Footer";
import NavBar from "../NavBar";
import phone from '../imagens/phone_14402.png';
import email from '../imagens/email_14410.png';

function Contato() {
    return (
        <body>
            <NavBar/>
            <h1>Fale conosco</h1>
            <table>
                <tr>
                    <td><img src={phone} alt="Telefone"/><i><b>(11) 91111-1111</b></i></td>
                    <td><img src={email} alt="E-mail"/><i><b>faleconosco@embarque.com.br</b></i></td>
                </tr>
            </table>
            <Footer/>
        </body>
    );
}