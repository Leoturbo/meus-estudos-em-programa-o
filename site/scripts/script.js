const btnPlay = document.querySelector("#btn-play");
const btnPlayIcon = document.querySelector("#btn-play-icon");
const btnPrev = document.querySelector("#btn-prev");
const btnNext = document.querySelector("#btn-next");
const musicName = document.querySelector("#music-name");
const musicAuthor = document.querySelector("#music-author");
const playerCurrentTime = document.querySelector("#player-current-time");
const playerDuration= document.querySelector("#player-duration");
const playerProgress = document.querySelector("#player-progress");
const audioPlayer = document.querySelector("#audio-player");

let currentMusic = 0;

const musics = [
{
	nome: "Easy On Me",
	author: "Adelle",
	path: "./assets/musics/Adelle - Easy On Me.mp3",
},

{
	nome: "Paradise",
	author: "Cold Play",
	path: "./assets/musics/Cold Play - Paradise.mp3",
},

{
	nome: "A Sky Full of Stars",
	author: "Cold Play",
	path: "./assets/musics/A Sky Full of Stars.mp3",
},

{
	nome: "Stressed Out",
	author: "Twenty One Pilots",
	path: "./assets/musics/02 Stressed Out.m4a",
},

{
	nome: "Anjos",
	author: "Rappa",
	path: "./assets/musics/Anjos (Pra Quem Tem Fé) [Versão Rádio]",
},
];


btnPlay.addEventListener("click", () => togglePlayMusic());
btnPrev.addEventListener("click", () => changeMusic(false));
btnNext.addEventListener("click", () => changeMusic());
audioPlayer.addEventListener("timeupdate", () => timeUpdate());



const togglePlayMusic = () => {
	if(audioPlayer.paused){
		audioPlayer.play();
		btnPlayIcon.classList.replace("bi-play-fill", "bi-pause-fill");
	}else {
		audioPlayer.pause();
		btnPlayIcon.classList.replace("bi-pause-fill", "bi-play-fill");
	}
};

const changeMusic = (next = true) => {
	if(next && currentMusic < musics.length - 1){
		currentMusic++;
	}else if (!next && currentMusic > 0) {
		currentMusic--;
	}else {
		return;
	}

	updatePlayer();
	togglePlayMusic();
};

const updatePlayer = () => {
	const music = musics[currentMusic];

	musicName.innerHTML = music.name;
	musicAuthor.innerHTML = music.author;
	audioPlayer.src = music.path;
};
 const timeupdate = () => {
 	const { currentTime, duration } = audioPlayer;

 	if (isNaN(duration)) return;

 	playerDuration.innerHTML = formatSecondsToMinutes(duration);
 	playerCurrentTime.innerHTML = formatSecondsToMinutes(currentTime);
 	playerProgress.max = duration;
 	playerProgress.value = currentTime;
 };

 const formatSecondsToMinutes = (seconds) => {
 	return new Date(seconds * 1000).toISOString().slice(14, 19);
 };

 window.onload = () => {
 	updatePlayer();
 }