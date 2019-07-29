1.Calculator2

使用Sdk版本28。

2.PuzzleGame

使用Sdk版本24。
	
1.讀取圖片並產生拼圖(3*3、4*4、5*5)
	a.更加熟悉應用Intent。
	b.了解Intent對於傳輸檔案大小的限制，即其解決辦法。
	c. LifeCycle被影響後如何保留拼圖，又不受Intent大小限制。
	d.了解BitMap應用。
2.讀取音樂
	a.完成Service播放音樂。
	b.使播放不受LifeCycle影響。做到可依據主Activity暫停來停止播放音樂，也可不受影響的在背景一直播放。
3.實作timer(用於計時並拿來進行排行)。
			a.做到符合避免畫面縮放導致的計時器重來。
4.利用Content Provider實作排行榜(3*3、4*4、5*5)。
		1.搭配學習SQLHelper對於SQLite。做到對於排行榜(Insert、Delete、Sort)。
		2.應用Fragment去區分排行榜區塊頁面(3*3、4*4、5*5)。
			a.利用HeadBar做到快速簡易的頁面切換。
			b.利用Clear重置排行榜。

		熟悉Android四大元件及LifeCycle。