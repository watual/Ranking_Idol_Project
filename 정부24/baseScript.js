
// // Firebase SDK 라이브러리 가져오기
//import initializeApp from "https://www.gstatic.com/firebasejs/9.22.0/firebase-app.js";
// import { getFirestore } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";
// import { doc, deleteDoc, query, limit, collection, addDoc, orderBy, getDocs, getDoc } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";


// Firebase 구성 정보 설정
const firebaseConfig = {
    apiKey: "AIzaSyDUo3wGBYmzDE0daVh0twAmzZ2r8TzyrGE",
    authDomain: "watual-f9224.firebaseapp.com",
    projectId: "watual-f9224",
    storageBucket: "watual-f9224.appspot.com",
    messagingSenderId: "307021915043",
    appId: "1:307021915043:web:ec35f5002d695d81a1f016",
    measurementId: "G-248XS4LSEE"
};

// // Firebase 인스턴스 초기화
const app = initializeApp(firebaseConfig);
// const db = getFirestore(app);


let asdf123 = document.getElementById('helloas');
asdf123.addEventListener('click', function (event){
    alert('asdfasdf'+event.target.value);
})

fetchDataAndRender();
$("#pressthis2").click(async function () {
    alert("asdfasdf");
});
$("#pressthis").click(async function () {
    alert("asdfasdf");
});
$('.deletebtn').click(async function () {
    let docs_id = $(this).attr('id');
    //alert(docs_id);

    const collectionPath = "movies";
    const querySnapshot = await getDocs(query(collection(db, collectionPath), orderBy("title")));
    //console.log(querySnapshot);
    //console.log(querySnapshot.id);

    if (!querySnapshot.empty) {
        const docToDelete = querySnapshot.docs[0];
        //alert(docToDelete.id);
        await deleteDoc(doc(db, "movies", docs_id));
        console.log("First document deleted:", docs_id);
    } else {
        console.log("No documents found in collection:", collectionPath);
    }
    window.location.reload();
});

$("#postingbtn").click(async function () {
    let image = $('#image').val();
    let title = $('#title').val();
    let star = $('#star').val();
    let comment = $('#comment').val();

    let doc = {
        'image': image,
        'title': title,
        'star': star,
        'comment': comment
    };
    await addDoc(collection(db, "movies"), doc);
    //alert('저장 완료!');
    window.location.reload();
});

let url = "http://spartacodingclub.shop/sparta_api/weather/seoul";
fetch(url).then(res => res.json()).then(data => {
    let temp = data['temp'];
    if (temp >= 20) {
        $('#temp').text("더워요");
    } else {
        $('#temp').text("추워요");
    }
});

$("#savebtn").click(async function () {
    $('#postingbox').toggle();
});

module.exports = {
    
}