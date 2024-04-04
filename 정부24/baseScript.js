

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