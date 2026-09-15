import { useState } from "react";

function BottonSalvar() {

    const [nome] = useState("");

    const salvar = async () => {

        const dados = {
            nome: nome
        };

        console.log("Dados enviados:", dados);

        try {

            const resposta = await fetch(
              "http://localhost:8080/Usuarios/salvar",
               {
                method: "POST",

                headers: {
                    "Content-Type": "application/json",
                },

                body: JSON.stringify(dados),
            });

            if (!resposta.ok) {
                throw new Error(`Erro HTTP: ${resposta.status}`);
            }

            alert("Dados salvos com sucesso!");

        } catch (error) {

            console.error("Erro ao salvar os dados:", error);

            alert("Erro ao conectar com o servidor");
        }
    };

    return (
        <div>
            <button
                className="bottonSalvar"
                onClick={salvar}
            >
                Salvar
            </button>
        </div>
    );
}

export default BottonSalvar;