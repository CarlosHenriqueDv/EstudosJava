

SELECT P.NAME, PV.NAME FROM PROVIDERS PV
INNER JOIN PRODUCTS P ON P.ID_PROVIDERS = PV.ID
WHERE
    PV.NAME = 'Ajax SA';