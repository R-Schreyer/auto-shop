import {Link} from "react-router-dom";
export default function Navigation(){

    return(
    <nav className="nav">
        <ul>
            <li>
                <Link to={"/Carlist"}>Autos</Link>
            </li>
        </ul>
    </nav>
    )
}