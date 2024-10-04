async function start() {

  let json_path = 'json/menu.json';
  
  let response = await fetch(json_path);

  let json = await response.json();

  for(let i = 0; i < json.categories.length; i++) {

    let column = document.createElement("div");
    column.classList.add("col-xs-12","col-sm-6","col-md-4","col-lg-3");

    let fig = document.createElement("figure");
    fig.classList.add("figure");

    let anchor = document.createElement("a");
    anchor.href = json.categories[i].url;

    let caption = document.createElement("figcaption");
    caption.classList.add("figure-caption");
    caption.innerHTML = json.categories[i].name;

    let img = document.createElement("img");
    img.src = json.categories[i].img;

    anchor.appendChild(img);
    fig.appendChild(anchor);
    fig.appendChild(caption);
    column.appendChild(fig);
    document.getElementById("row").appendChild(column);
  }
}



function description(ul, items) {
  for (let item of items) {
    let li = document.createElement("li");
    li.classList.add("list-group-item", "d-flex", "justify-content-between", "allgn-Items-center", "text-start");

    li.innerHTML = `<div>
                      <div class="fw-bold">${item.name}</div>
                      ${item.description}
                    </div>
                    <span class="badge text-bg-primary rounded-pill">$${item.price}</span>`;
    ul.appendChild(li);
  }
}

function ingredients(ul, items) {
  for (let item of items) {
    let li = document.createElement("li");
    li.classList.add("list-group-item", "d-flex", "justify-content-between", "allgn-Items-center", "text-start");

    let div = document.createElement("div");
    let div2 = document.createElement("div");
    div2.classList.add("fw-bold");
    div2.innerHTML = item.name;

    div.appendChild(div2);

    let ull = document.createElement("ul");

    for (let i = 0; i < item.ingredients.length; i++) {
      let ciao = document.createElement("li");
      ciao.innerHTML = item.ingredients[i];
    ull.appendChild(ciao);
    }

    div.appendChild(ull)

    let pill = document.createElement("span");
    pill.classList.add("badge", "text-bg-primary", "rounded-pill");
    pill.innerHTML = item.price;

    div.appendChild(pill);

    li.appendChild(div);
    
    ul.appendChild(li);

/*     let div = document.createElement("div");
    let div2 = document.createElement("div");
    div2.classList.add("fw-bold");
    div2.innerHTML = item.name;

    div.appendChild(div2);
    div.innerHTML +=item.description;

    let pill = document.createElement("span");
    pill.classList.add("badge", "text-bg-primary", "rounded-pill");
    pill.innerHTML = item.price;

    div.appendChild(pill);

    li.appendChild(div);

    ul.appendChild(li); */

  }

}

async function loadDescription(category) {
  let ul = document.getElementById(category);

  let response = await fetch(`../json/${category}.json`);
  let json = await response.json();
  let list = json[category];
  description(ul, list);
}

async function loadIngredients(category) {
  let ul = document.getElementById(category);

  let response = await fetch(`../json/${category}.json`);
  let json = await response.json();
  let list = json[category];
  ingredients(ul, list);
}