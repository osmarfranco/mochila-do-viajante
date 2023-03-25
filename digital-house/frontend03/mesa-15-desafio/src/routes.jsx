import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Home from "./pages/home";
import Form from "./pages/form";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Home />,
  },
  {
    path: "/cadastro",
    element: <Form />,
  },
]);

function Routes() {
  return(
    <>
      <RouterProvider router={router}/>
    </>
  )
}

export default Routes;
