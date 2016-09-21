var myApp = angular.module('myModel',[]);   

var showDetail = function showDetail($scope){
    var detail  = [
          { title:'Motorola XOOM™ with Wi-Fi', description: 'The Next, Next Generation Experience the future with Motorola XOOM with Wi-Fi, the world\'s first tablet powered by Android 3.0 (Honeycomb).', url:'images/motorola-xoom-with-wi-fi.0.jpg',date :new Date('2016','06','02')},
        
           {  title:'MOTOROLA XOOM™', description: 'The Next, Next Generation Experience the future with MOTOROLA XOOM, the world\'s first tablet powered by Android 3.0 (Honeycomb).', url:'images/motorola-xoom.0.jpg' , date:new Date('2016','09','11')},
        
           {  
               title:'MOTOROLA ATRIX™ 4G',
               description: 'MOTOROLA ATRIX 4G the world\'s most powerful smartphone.', 
               url:'images/droid-2-global-by-motorola.0.jpg',
               date:new Date('2015','12','22') 
           },
           { title:'Dell Streak 7',
            description: 'Introducing Dell™ Streak 7. Share photos, videos and movies together. It’s small enough to carry around, big enough to gather around.',  url:'images/dell-streak-7.0.jpg',
            date:new Date('2014','05','18')
           },
           { title:'Dell Venue™ 8',   
            description: 'The Samsung Gem™ brings you everything that you would expect and more from a touch display smart phone – more apps, more features and a more affordable price.', 
            url:'images/nexus-s.0.jpg',
            date:new Date('2015','03','21')
           } ,  
               { title:'Samsung Gem™',   
            description: 'The Samsung Gem™ brings you everything that you would expect and more from a touch display smart phone – more apps, more features and a more affordable price.', 
            url:'images/samsung-gem.0.jpg',
            date:new Date('2015','03','21')
           } ,
            { title:'Dell Venue',   
            description: 'The Dell Venue; Your Personal Express Lane to Everything', 
            url:'images/motorola-xoom.0.jpg',
            date:new Date('2015','03','21')
           } ,
            { title:'Nexus S',   
            description: 'Fast just got faster with Nexus S. A pure Google experience, Nexus S is the first phone to run Gingerbread (Android 2.3), the fastest version of Android yet.', 
            url:'images/nexus-s.0.jpg',
            date:new Date('2015','03','21')
           } 
    ];
    $scope.detail = detail ;
}


myApp.controller('myController',showDetail);  