// Sample data for songs
const songs = [
  { title: 'Song 1', artist: 'Artist 1', duration: '3:30', favorite: false },
  { title: 'Song 2', artist: 'Artist 2', duration: '4:15', favorite: true },
  { title: 'Song 3', artist: 'Artist 3', duration: '2:50', favorite: false },
  // Add more songs here...
];

// Function to display songs on the UI
function displaySongs() {
  const mainContent = document.querySelector('.main-content');
  mainContent.innerHTML = '';
  songs.forEach(song => {
    const songCard = document.createElement('div');
    songCard.classList.add('song-card');
    songCard.innerHTML = `
      <img src="album-art.jpg" alt="Album Art">
      <div class="song-info">
        <h3>${song.title}</h3>
        <p>${song.artist}</p>
        <p>${song.duration}</p>
      </div>
    `;
    if (song.favorite) {
      songCard.classList.add('favorite');
    }
    mainContent.appendChild(songCard);
  });
}

// Event listener for sidebar navigation
document.querySelectorAll('.sidebar li').forEach(item => {
  item.addEventListener('click', event => {
    // Handle navigation here...
  });
});

// Initial display of songs
displaySongs();
