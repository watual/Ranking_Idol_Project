
// Firebase SDK 라이브러리 가져오기
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-app.js";
import { getFirestore } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";
import { doc, deleteDoc, query, limit, collection, addDoc, orderBy, getDocs, getDoc } from "https://www.gstatic.com/firebasejs/9.22.0/firebase-firestore.js";


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

// Firebase 인스턴스 초기화
const app = initializeApp(firebaseConfig);
const db = getFirestore(app);

let docs = await getDocs(collection(db, "movies"));
docs.forEach((doc) => {
    let row = doc.data();
    doc.id;
    //console.log(row);

    let image = row['image'];
    let title = row['title'];
    let comment = row['comment'];
    let star = row['star'];
    let docs_id = doc.id;
    console.log(image, title, star, comment);
    let temp_html = `
    <div class="col">
        <div class="card h-100">
            <img src="${image}"
                class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">${title}</h5>
                <p class="card-text">${star}</p>
                <p class="card-text">${comment}</p>
            </div>
            <input type="button" class="deletebtn" id="${docs_id}" value="Delete"/>
        </div>
    </div>`;

    $('#card').append(temp_html);
});