/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor. */
(function(a){a.fn.imgscale=function(f){f=a.extend({parent:false,scale:"fill",center:true,fade:0},f);var i,e,j,k,c,d,h,b;this.each(function(){var l=a(this);var m=(!f.parent?l.parent():l.parents(f.parent));m.css({opacity:0,overflow:'hidden'});if(m.length>0){l.removeAttr("height").removeAttr("width");if(this.complete){g(l,m,false)}else{l.load(function(){g(l,m,true)})}}});function g(l,p,r){i=p.height();e=p.width();j=l.height();k=l.width();n();function n(){if(e>i){m("w")}else{if(e<i){m("t")}else{if(e==i){m("s")}}}}function m(v){if(k>j){t(v,"w")}else{if(k<j){t(v,"t")}else{if(k==j){t(v,"s")}}}}function t(w,v){if(w=="w"&&v=="w"){q()}else{if(w=="w"&&v=="t"){s("w")}else{if(w=="w"&&v=="s"){s("w")}else{if(w=="t"&&v=="w"){s("w")}else{if(w=="t"&&v=="t"){q()}else{if(w=="t"&&v=="s"){s("t")}else{if(w=="s"&&v=="w"){s("t")}else{if(w=="s"&&v=="t"){s("w")}else{if(w=="s"&&v=="s"){s("w")}}}}}}}}}}function q(){if((k*i/k)>=e){s("t")}else{s("w")}}function s(v){switch(v){case"t":if(f.scale=="fit"){l.attr("width",e)}else{l.attr("height",i)}break;case"w":if(f.scale=="fit"){l.attr("height",i)}else{l.attr("width",e)}break}if(f.center){o()}else{u()}}function o(){c=l.width();d=l.height();if(d>i){b="-"+(Math.floor((d-i)/2))+"px";l.css("margin-top",b)}if(c>e){h="-"+(Math.floor((c-e)/2))+"px";l.css("margin-left",h)}u()}function u(){if(f.fade>0&&r){p.animate({opacity:1},f.fade)}else{p.css("opacity",1)}}}}})(jQuery);