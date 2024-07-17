var player;

// DOMContentLoaded 이벤트 리스너 추가
document.addEventListener('DOMContentLoaded', function() {
  // 버튼 클릭 이벤트 리스너
  document.getElementById('seekButton').addEventListener('click', seekToTime);
});

// YouTube IFrame API가 준비되면 호출되는 함수
function onYouTubeIframeAPIReady() {
  player = new YT.Player('player', {
    videoId: videoId,
    events: {
      'onReady': onPlayerReady,
      'onStateChange': onPlayerStateChange
    }
  });
}

// 비디오 플레이어가 준비되면 호출되는 함수
function onPlayerReady(event) {
  // 자동 재생을 제거하기 위해 event.target.playVideo()를 호출하지 않습니다.
}

// 플레이어 상태가 변경되면 호출되는 함수
function onPlayerStateChange(event) {
  if (event.data == YT.PlayerState.ENDED) {
    alert('비디오가 끝났습니다.');
  }
}

// 입력된 시간으로 이동하는 함수
function seekToTime() {
  var timeInput = document.getElementById('timeInput').value;
  var seekTime = parseInt(timeInput, 10);
  if (!isNaN(seekTime)) {
    player.seekTo(seekTime, true);
    player.playVideo(); // 이동 후 비디오 재생
  }
}
