import './App.css';
import Cabesalho from './components/Cabesalho';


function App() {
    return (
        <>


            <Cabesalho />


            <div className="card">


                <div className="formulario">
                    <div className="labelnome">
                        <label htmlFor="nome">
                            Nome
                        </label>
                    </div>

                    <div>
                        <input type="nome"
                            placeholder="Digite seu nome..."
                        />
                    </div>


                    <br />



                    <div className="labelemail">
                        <label htmlFor="email">
                            Email
                        </label>
                    </div>







                    <div>
                        <input type="email"
                            placeholder="Digite seu email..."
                        />
                    </div>






                    <br />

                    <div className="labeltelefone">
                        <label htmlFor="telefone">
                            Telefone
                        </label>
                    </div>

                    <div>
                        <input type="telefone"
                            placeholder="Digite seu telefone..."
                        />
                    </div>
                </div>


               
                
                <div>
                    <a href="https://seusite.com.br" className="botao-enviar"></a>
                    <button className="botao">
                        Enviar
                    </button>
                </div>


                <div>
                    <a href="https://seusite.com.br" className="botao-cancelar"></a>
                    <button className="botao">
                        Cancelar
                    </button>
                </div>

                
             


            </div>



        </>
    )
}

export default App
