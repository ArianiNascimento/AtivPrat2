import Footer from "../Footer";
import NavBar from "../NavBar";
import sp from '../imagens/sp.jpg';
import rj from '../imagens/rj.jpg';
import ma from '../imagens/ma.jpg';
import rs from '../imagens/rs.jpg';

function Promocoes() {
    return (
        <body>
            <NavBar/>
            <h1>Promoções atuais</h1>

            <div className="destinos">
                <table>
                    <tr>
                        <td>
                            <img className="locais" src={ma} alt="São Luís"/>
                            <br/>
                            <p>São Luís</p>
                            <p><del>R$ 1.678,30</del></p>
                            <p>R$ 1.274,00</p>
                        </td>
                        <td>
                            <img className="locais" src={sp} alt="São Paulo"/>
                            <br/>
                            <p>São Paulo</p>
                            <p><del>R$ 1.350,90</del></p>
                            <p>R$ 645,75</p>
                        </td>
                        <td>
                            <img className="locais" src={rs} alt="Porto Alegre"/>
                            <br/>
                            <p>Porto Alegre</p>
                            <p><del>R$ 940,99</del></p>
                            <p>R$ 683,52</p>
                        </td>
                        <td>
                            <img className="locais" src={rj} alt="Rio de Janeiro"/>
                            <br/>
                            <p>Rio de Janeiro</p>
                            <p><del>R$ 1.565,79</del></p>
                            <p>R$ 1.100,20</p>
                        </td>
                    </tr>
                </table>
            </div>
            <Footer/>
        </body>
    );
}

export default Promocoes;