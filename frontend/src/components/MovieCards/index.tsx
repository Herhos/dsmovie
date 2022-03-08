import MovieScores from 'components/MovieScores';
import { Link } from 'react-router-dom';

function MovieCards() 
{
   const movie = {
      id: 1,
      image: "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg",
      title: "The Witcher",
      count: 2,
      score: 4.5
  };

   return (
      <div>
         <img className="dsmovie-movie-card-image" src={movie.image} alt={movie.title} />
         <div className="dsmovie-card-bottom-container">
            <h3>{movie.title}</h3>

            <MovieScores />

            <Link to={`/form/${movie.id}`}>
               <div className="btn btn-primary dsmovie-btn">Avaliar</div>
            </Link>            
         </div>
      </div>
   );
}

export default MovieCards;