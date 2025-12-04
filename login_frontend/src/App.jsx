import {useState} from 'react'
import axios from 'axios'
import './App.css'

function App(){
  const [username] = useState("")
  const [password] = useState("")

  axios.post("http://localhost:8080/login-page", {
    password : password,
    usersName : username
  })
  .then(res => console.log(res.data))
  .catch(err => console.log(err));

  
  return (
    <>
       <Logindesgin />
    </>
  );
}









{/* THE LOGIN DESING FUNCTION  */}

function Logindesgin(){
  return (

  <div className = "Login-div">
        <div className = "login-space"><p className = "Login-label">Login</p></div>
        <div className = "login-form-div">
        <form>
          <input type = "text" placehoder = "Enter the Username"></input> <br></br>
          <input type = "text" placeholder = "Enter the Password"></input>
          <button type="submit" className="login-submit-btn">Submit</button>
        </form>
        </div>
  </div>
  );
}

export default App
