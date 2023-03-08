import { useState } from 'react'
import './App.css'

function App() {

  const [nome, setNome] = useState("");
  const [idade, setIdade] = useState("");
  const [pokemonFavorito, setPokemonFavorito] = useState("");
  const [listaUsuarios, setListaUsuarios] = useState([]);

  const adicionarUsuario =()=>{

      const novoUsuario ={
        nomeUsuario: nome,
        idadeUsuario: idade,
        pokemon: pokemonFavorito
      }

      setListaUsuarios([...listaUsuarios, novoUsuario])
      setNome("");
      setIdade("");
      setPokemonFavorito("");
  }

  return (
    
    <div className="container">
    <div className='logo'></div>
    <h1>cadastro</h1>

    <form>
      <div className="campo">
        <p>Nome ou apelido:</p>
        <input type="text" value={nome} onChange={(event)=> setNome(event.target.value)}></input>
      </div>
      <div className="campo">
        <p>Idade:</p>
        <input type="text" value={idade} onChange={(event)=> setIdade(event.target.value)}></input>
      </div>
      <div className="campo">
        <p>Pokémon Favorito:</p>
        <input type="text" value={pokemonFavorito}  onChange={(event)=> setPokemonFavorito(event.target.value)}></input>
      </div>
        <input type="button" value="Adicionar" onClick={adicionarUsuario}/>
    </form>
    <h2>amigos cadastrados:</h2>
    <ul>
      {listaUsuarios.map((item,index)=>(<li key={index}>{item.nomeUsuario} - {item.idadeUsuario} anos - {item.pokemon}</li>))}
    </ul>
  </div>

  )
}

export default App
