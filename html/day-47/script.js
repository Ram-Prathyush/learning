const testimonialContainer = document.querySelector('.testimonial-container')
const testimonial = document.querySelector('.testimonial')
const userImage = document.querySelector('.user-image')
const username = document.querySelector('.username')
const role = document.querySelector('.role')

const testimonials = [
    {
    name: 'John',
    position: 'markiting',
    image: 'https://randomuser.me/api/portraits/men/46.jpg',
    text: 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis neque reprehenderit laborum, corporis explicabo assumenda. Porro impedit consectetur animi, reprehenderit recusandae sapiente at aliquam reiciendis modi ipsam rerum suscipit distinctio?'
},
    {
        name: 'Sandy',
        position: 'java devoleper',
        image: 'https://randomuser.me/api/portraits/women/46.jpg',
        text: 'Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock',
},

    {
        name: 'Amy',
        position: 'clerk',
        image: 'https://randomuser.me/api/portraits/women/47.jpg',
        text: 'There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don\'t look even slightly believable.',
    },

     {
    name:'Tyrell',
    position:'Marketing',
    image:'https://randomuser.me/api/portraits/men/46.jpg',
    text: 'If you are going to use a passage of Lorem Ipsum, you need to be sure there isn\'t anything embarrassing hidden in the middle of text.',
     },

     {
     name:'Wanda',
     position:'manager',
     image:'https://randomuser.me/api/portraits/women/48.jpg',
     text: 'Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.',
     },
]

let idx = 1

function updateTest (){
    const {name, position, image, text} = testimonials[idx]

    testimonial.innerHTML = text
    userImage.src = image
    username.innerHTML = name
    role.innerHTML = position

    idx++

    if(idx < testimonials.length - 1){
        idx = 0;
    }
}

setInterval(updateTest, 10000)
