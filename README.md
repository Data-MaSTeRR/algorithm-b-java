1. Scanner vs BufferedReaderScanner
- 버퍼 크기가 $1KB$로 작고, 매번 입력을 형변환하는 과정을 거치느라 느립니다.
- BufferedReader: 버퍼 크기가 $8KB$로 크며, 한 번에 읽어와 메모리에 올려두고 처리하므로 훨씬 빠릅니다.
2. StringTokenizer 사용
- String.split(" ")은 내부적으로 정규식을 사용하기 때문에 느립니다. 단순히 공백으로 문자를 나눌 때는 StringTokenizer가 훨씬 성능이 좋습니다.