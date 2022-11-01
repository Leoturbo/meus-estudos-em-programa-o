const link = document.querySelector('link[rel="monetization"]')

let total = 0
let scale 

link.addEventListener("monetization", (e) =>{
	console.log("Yay! Monetization is on")
	// Display to user if monetization is on
	const monetizationDisplay = document.getElementById("monetization-info")
	monetizationDisplay.textContent = "Monetized"
	monetizationDisplay.classList.add("Monetized")
	monetizationDisplay.classList.remove("not-monetized")

	// Show exclesive content to the user if monetization is on 
	document.getElementById("exclusive").classList.remove("hidden")

	// Implement micropayment couter and display it to our user
	const { amount, assetCode, assetScale} = e 

	if (total === 0){
		scale = assetScale
		document.getElementById("currency").innerText = assetCode
	}

	total += new Number(amount)
	const formatedTotal = (total * Math.pow(10, -scale)).toFixed(scale)
	document.getElementById("total").innerText = formatedTotal


})