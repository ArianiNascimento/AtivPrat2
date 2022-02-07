import logo from './imagens/Embarque.png';

function NavBar() {
    return (
        <div>
                <nav>
                    <table>
                        <tr>
                        <td><a href="index.html"> <img width="150px" src={logo} alt="Logo"/></a></td>
                        <td><a href="index.html">Página inicial</a></td>
                        <td><a href="Destinos.html">Destinos</a></td>
                        <td><a href="Promocoes.html">Promoções</a></td>
                        <td><a href="Contato.html">Contato</a></td>
                        </tr>
                    </table>
                </nav>
            </div>
    );
}

export default NavBar;