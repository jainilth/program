import {React,useState } from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route, Outlet, Link } from "react-router-dom";
const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(<h1>hello</h1>);.
// root.render(
//   <>
//   <h1>Hello, world!</h1>
//   </>
// )

// function Com(){
//   return(
//     <>
//     <h1>Hello, world!</h1>
//     </>
//   )
// }

// function Seperator({num,by}){
//   let seperatorString=''
//   for(let i=0;i<num;i++){
//     seperatorString+=by
//   }
//   return(
//     <>
//       <p>{seperatorString}</p>
//     </>
//   )
// }
// root.render(
//   <>
//   <DCC/>
//   <Seperator num="50" by="$"/>
//   <Com/>
//   <Seperator num="50" by="#"/>
//   <Car name="jack"/>
//   </>
// )

function Layout() {
  return (
    <>
      <div className='container'>
        <div className='row m-1'>
          <div className='col-2 d-flex justify-content-center border border-danger fs-5'>
            logo
          </div>
          <div className='col-9 d-flex justify-content-center p-4 mx-1 border border-primary'>
            <Link to='/home' className='mx-3 fs-4'>home</Link>
            <Link to='/about' className='mx-3 fs-4'>about</Link>
            <Link to='/contact' className='mx-3 fs-4'>contact</Link>
            <Link to='/student' className='mx-3 fs-4'>student</Link>
          </div>
        </div>
        <div className='row m-1'>
          <div className='col-4 fs-5 d-flex justify-content-center border border-warning'>
            components
          </div>
          <div className='col-7 mx-1 d-flex justify-content-center border border-info'>
            <Outlet />
          </div>
        </div>
        <div className='row m-1'>
          <div className='col-11 fs-5 d-flex justify-content-center border border-warning'>
            footer
          </div>
        </div>
      </div>
    </>
  )
}
function Home() {
  return (
    <>
      <h1>Home</h1>
    </>
  )
}
function About() {
  return (
    <>
      <h1>about</h1>
    </>
  )
}
function Contact() {
  return (
    <>
      <h1>contact</h1>
    </>
  )
}
function Student() {
  const [countState, setCountState] = useState(0)
  return (
    <>
      <button onClick={() => {
        setCountState(countState + 1)
      }}>increment</button>
      <h1>total student count is={countState}</h1>
    </>
  )
}

root.render(
  <>
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Layout />}>
          <Route path='home' element={<Home />} />
          <Route path='about' element={<About />} />
          <Route path='contact' element={<Contact />} />
          <Route path='student' element={<Student />} />
        </Route>
      </Routes>
    </BrowserRouter>
  </>
)
