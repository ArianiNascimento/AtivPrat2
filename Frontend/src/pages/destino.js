import Footer from "../Footer";
import NavBar from "../NavBar";
import sp from '../imagens/sp.jpg';
import rj from '../imagens/rj.jpg';
import ba from '../imagens/ba.jpg';
import rn from '../imagens/rn.jpg';
import ma from '../imagens/ma.jpg';
import rs from '../imagens/rs.jpg';
import sc from '../imagens/sc.jpg';
import am from '../imagens/am.jpg';
import pa from '../imagens/pa.jpg';
import go from '../imagens/go.jpeg';

function Destino() {
    return (
        <body>
            <NavBar/>
            <h1>Destinos nacionais</h1>
            <div className destinos>
        <table>
            <tr>
                <td>
                    <img className="locais" src={sp} alt="São Paulo"/>
                </td>
                <td>
                    <h2>São Paulo - SP</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={rj} alt="Rio de Janeiro"/>
                </td>
                <td>
                    <h2>Rio de Janeiro - RJ</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={ba} alt="Salvador"/>
                </td>
                <td>
                    <h2>Salvador - BA</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={rn} alt="Natal"/>
                </td>
                <td>
                    <h2>Natal - RN</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={ma} alt="São Luís"/>
                </td>
                <td>
                    <h2>São Luís - MA</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={rs} alt="Porto Alegre"/>
                </td>
                <td>
                    <h2>Porto Alegre - RS</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={sc} alt="Florianópolis"/>
                </td>
                <td>
                    <h2>Florianópolis - SC</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={am} alt="Manaus"/>
                </td>
                <td>
                    <h2>Manaus - AM</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={pa} alt="Belém"/>
                </td>
                <td>
                    <h2>Belém - PA</h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img className="locais" src={go} alt="Goiânia"/>
                </td>
                <td>
                    <h2>Goiânia - GO</h2>
                </td>
            </tr>
        </table>
    </div>
    <Footer/>
</body>
    );
}

export default Destino;