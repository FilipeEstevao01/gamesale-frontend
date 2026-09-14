import { useState } from "react"



function BottonDeletar() {
    const [nome] = useState('');

    const deletar = () => {
        console.log('Nome:', nome);
    };

    return (
        <div>
           <button className="BottonDeletar"  onClick={deletar}>
             Deletar
           </button>
        </div>
    );
}


export default BottonDeletar