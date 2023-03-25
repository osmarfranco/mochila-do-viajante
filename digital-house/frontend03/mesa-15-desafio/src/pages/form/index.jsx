import { useEffect, useState } from "react";
import axios from "axios";
import { Link, useLocation, useNavigate} from "react-router-dom";

export default function Form() {
    const navigate = useNavigate();
    const location = useLocation();
    let alunoMemoria = {
        nome: location.state.aluno_nome,
        matricula: location.state.aluno_matricula,
        curso: location.state.aluno_curso,
        bimestre: location.state.aluno_bimestre,
        id: location.state.aluno_id,
    }

    const [nome, setNome] = useState("");
    const [matricula, setMatricula] = useState("");
    const [curso, setCurso] = useState("");
    const [bimestre, setBimestre] = useState("");
    const [id, setId] = useState("");

    function limparCampos() {
        setNome("");
        setMatricula("");
        setCurso("");
        setBimestre("");
        setId("");
    }

    function preencherCampos(aluno){
        setNome(aluno.nome);
        setMatricula(aluno.matricula);
        setCurso(aluno.curso);
        setBimestre(aluno.bimestre);
        setId(aluno.id);
    }

    async function postAlunos(event){
        event.preventDefault();

        try {
            await axios.post("https://api-aluno.vercel.app/aluno", {
                nome: nome,
                matricula: matricula,
                curso: curso,
                bimestre: bimestre,
            });
            alert("Aluno cadastrado com sucesso")
            limparCampos();
        } catch (error) {
            alert("Erro ao cadastrar aluno")
        }
    }

    async function putAluno(event){
        event.preventDefault();

        try {
            await axios.put(`https://api-aluno.vercel.app/aluno/${id}`, {
                nome: nome,
                matricula: matricula,
                curso: curso,
                bimestre: bimestre,
            });
            limparCampos();
            alert("Dados do aluno editados com sucesso");
        } catch (error) {
            alert("Erro ao tentar editar dados do aluno")
            console.log(error)
        }
    }

    useEffect(() => alunoMemoria ? preencherCampos(alunoMemoria) : null, [1])

    return(
        <>
            <nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                        <a class="nav-link text-light" aria-current="page" href="" onClick={() => navigate('/')}>Home</a>
                        </li>
                        <li class="nav-item ">
                        <a class="nav-link active text-light fw-bold" href="" onClick={() => navigate('/cadastro')}>Cadastro</a>
                        </li>
                    </ul>
                    </div>
                </div>
            </nav>
            <div class="container mt-4">
                <div class="row row-cols-2">
                    <form onSubmit={id ? putAluno : postAlunos}>
                    <div class="mb-3">
                        <label class="form-label">Nome</label>
                        <input class="form-control" value={nome} onChange={(event) => setNome(event.target.value)}/>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Matricula</label>
                        <input class="form-control" value={matricula} onChange={(event) => setMatricula(event.target.value)}/>
                    </div>
                    <div class="mb-3">
                        <label flass="form-label">Curso</label>
                        <input class="form-control" value={curso} onChange={(event) => setCurso(event.target.value)}/>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Bimestre</label>
                        <input class="form-control" value={bimestre} onChange={(event) => setBimestre(event.target.value)}/>
                    </div>
                    
                    <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>

                </div>
            </div>
        </>
    )
}