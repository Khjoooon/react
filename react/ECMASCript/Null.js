let input
const nickname = input ?? '김조은'
// const nickname = input
// if(input == null || input == undefined)
//     nicknmae = '김조은'

if( nickname) {
    console.log("이름이 있습니다.");
}

if( !nickname) {
    console.log("이름이 없습니다.");
}

console.log(`이름 : ${nickname}`);

