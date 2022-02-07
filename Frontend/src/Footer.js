import pgto from './imagens/mercado-pago-logo.png';

function Footer() {
    return (
        <footer>
            <h3>Formas de pagamento</h3>
            <img class="footer" src={pgto} alt="Formas de pagamento"/>
        </footer>
    );
}

export default Footer;