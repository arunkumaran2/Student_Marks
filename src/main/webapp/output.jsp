   <h1>Your Tamil mark: ${chagre} (${TamilResult})</h1>
    <h1>Your English mark: ${chagre1} (${EnglishResult})</h1>
    <h1>Your Maths mark: ${chagre2} (${MathsResult})</h1>
    <h1>Your Science mark: ${chagre3} (${ScienceResult})</h1>
    <h1>Your Socialscience mark: ${chagre4} (${SocialscienceResult})</h1>
    <h1>Your Total mark: ${chagre5}</h1>
    <h1>Your percentage: ${chagre6}</h1>
    <h1>Your highest mark: ${chagre7}</h1>
    <h1>Your lowest mark: ${chagre8}</h1>
   
    <h1>  <p>
        <c:choose>
            <c:when test="${not empty chagre9}">
                Class: ${chagre9}
            </c:when>
            <c:when test="${not empty chagre10}">
                 ${chagre10}
            </c:when>
            <c:when test="${not empty chagre11}">
                 ${chagre11}
            </c:when>
        </c:choose>
    </p></h1>
   
