SELECT
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') DATE_OF_BIRTH
FROM
    MEMBER_PROFILE
WHERE
    GENDER = 'W'
AND
    TLNO IS NOT NULL 
AND
    TO_CHAR(DATE_OF_BIRTH, 'MM') = '03'
ORDER BY MEMBER_ID ASC;
