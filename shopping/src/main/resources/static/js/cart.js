

/*
price 
stock 
size
quantity 주문할 제품갯수
productName 상품명
productDescription 상품설명
*/


function cartFetch() {

	let data = { // json 객체로 만들기위해 데이터화
		id: sessionId, //회원아이디
		size: size, //제품 사이즈
		count: quantity, //선택한 상품개수
		contentsno:contentsno //넘어온 contents 상품번호 
	};

	return fetch(`/contents/cart/${price}/${stock}/${productName}/${productDescription}/${filename}`, {
		method: "post",
		body: JSON.stringify(data),
		headers: { 'Content-Type': "application/json; charset=utf-8" }
	})
		.then(response => response.json())
		.catch(console.log)
}