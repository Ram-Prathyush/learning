const APIURL = 'https://api.github.com/users/';

const form = document.getElementById('form');
const main = document.getElementById('main');
const search = document.getElementById('search');

async function getUser(username){
    try{
        const { data } = await axios(APIURL + username);

    createUserCard(data)
    getRepos(username)

    }catch(err){
        if(err.response.status == 404){
            createErrorCard('No profile whith this username')
        }
      
    }
} 

async function getRepos(username){
    try{
        const { data } = await axios(APIURL + username + '/repos');
        console.log('data->', data)
    addReposToCard(data)
    

    }catch(err){
        console.log('err->', err)
            createErrorCard('Problem fetching repos')
      
    }
}

function createUserCard(user){
    console.log('user ->', user)
    const cardHTML = ` <div class="card">
    <div>
        <img src="${user.avatar_url}" alt="${user.name}" class="avatar">
    </div>
    <div class="user-info">
        <h2>${user.name}</h2>
        <p>${user.bio}</p>
        <ul>
            <li>${user.followers} <strong> Followers </strong></li>
            <li>${user.following} <strong> Following </strong></li>
            <li>${user.public_repos} <strong> repos </strong></li>
        </ul>

        <div id="repos"></div>
    </div>
</div>`

main.innerHTML = cardHTML
}

function createErrorCard(msg){
    const cardHTML = `
    <div class = "card">
        <h1>${msg}</h1>
    </div>
    `

    main.innerHTML = cardHTML;
}

function addReposToCard(repos){
    const reposEl = document.getElementById('repos')

    repos
    .slice(0, 10)
          .forEach(repo  => {
            console.log('repo->', repo)
            const repoEl = document.createElement('a')

            repoEl.classList.add('repo')
            repoEl.href = repo.html_url
            repoEl.target = '_blank'
            repoEl.innerText = repo.name

            reposEl.appendChild(repoEl)
          })
}


form.addEventListener('submit', (e) => {
    e.preventDefault();

    const user =  search.value;
        console.log('user->', user);
    if(user){
        getUser(user);

       search.value = '';
    }
})

 
