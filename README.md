Description
This Spring Boot application provides a REST API to search for movies stored in memory (no external database required).
You can filter movies by genre and/or rating, and paginate the results using offset and limit query parameters. The API responds with a list of movie names (titles) matching the filters.

Example Request (for Postman or browser)
Endpoint:

text
GET http://localhost:8080/api/movies/search?genre=ACTION&rating=UA&offset=0&limit=10
Parameters:

genre – (optional) Movie genre (e.g., ACTION, COMEDY, DRAMA, etc.)

rating – (optional) Movie rating (U, UA, A, S)

offset – (default=0) Start index for pagination

limit – (default=10) Maximum number of movies returned

Example curl command
text
curl "http://localhost:8080/api/movies/search?genre=ACTION&rating=UA&offset=0&limit=10"
Response:
A JSON array of movie names (e.g.):

json
[
  "Movie 7",
  "Movie 15"
]
