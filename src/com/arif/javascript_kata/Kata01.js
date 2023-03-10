function getAllFridays(year) {
    let fridays = [];

    // Loop through all 12 months
    for (let month = 0; month < 12; month++) {
        // Create a new Date object for the first day of the month
        let date = new Date(year, month, 1);

        // Loop through all the days in the month
        while (date.getMonth() === month) {
            // Check if the current day is a Friday
            if (date.getDay() === 5) {
                fridays.push(new Date(date)); // Add the Friday to the array
            }

            // Move to the next day
            date.setDate(date.getDate() + 1);
        }
    }

    return fridays;
}

// Example usage: find all Fridays in 2023
let fridays2023 = getAllFridays(2023);

console.log(fridays2023);
