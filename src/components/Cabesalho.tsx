import H1Title from './Title';



function Cabesalho() {
    return (
        <header className='Topo'>

            <H1Title />
            
            <nav>
                <a href="/" style={{ marginLeft: '1400px', color: '#070707' }}>Início</a>
                <br />
                <a href="/sobre" style={{ marginLeft: '1400px', color: '#070707' }}>Sobre</a>
                <br />
                <a href="/contato" style={{ marginLeft: '1400px', color: '#070707' }}>Contato</a>
            </nav>
        </header>
    );
}

export default Cabesalho;