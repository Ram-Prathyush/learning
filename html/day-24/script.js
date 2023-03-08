const header = document.getElementById('header');
const title = document.getElementById('title');
const excpret = document.getElementById('excpret');
const profile_img = document.getElementById('profile_img');
const name = document.getElementById('name');
const date = document.getElementById('date');

const animated_bgs  = document.querySelectorAll('.animated-bg')
const animated_bg_texts  = document.querySelectorAll('.animated-bg-text')

setTimeout(getData, 2500)

function getData(){
header.innerHTML = ' <img src="https://source.unsplash.com/X16zXcbxU4U" alt="">'
title.innerHTML = 'Hi welcome to my thing!';
excerpt.innerHTML = 'Hi do you want to see my animation? if you want press F5';
profile_img.innerHTML = '<img src="https://randomuser.me/api/portraits/men/45.jpg" alt="">';
name.innerHTML = 'Jhon Doe';
date.innerHTML = 'Mar 3, 2023';

animated_bgs.forEach(bg => bg.classList.remove('animated-bg'))
animated_bg_texts.forEach(bg => bg.classList.remove('animated-bg-text'))


}