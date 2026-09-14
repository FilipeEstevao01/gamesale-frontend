import H1Title from './Title';


function Cabesalho() {
    return (
        <header
            style={{
                backgroundColor: '#d7d6d6',
                padding: '10px',
                borderRadius: '16px',
                border: '2px solid transparent',
                backgroundImage: 'linear-gradient(145deg, rgba(120, 35, 95, 0.65), rgba(115, 160, 255, 0.65))',
                backgroundClip: 'padding-box',
                boxShadow: 'inset 0 0 0 2px #d7d6d6',
            }}
        >
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